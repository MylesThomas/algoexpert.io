import './App.css';
import { useState, useMemo, useCallback, lazy, Suspense } from 'react';
// import MyButton from './MyButton';
const MyButton = lazy(() => import('./MyButton'));

export default function App() {
  const [num, setNum] = useState(10);
  const [logValue, setLogValue] = useState('');

  const fibValue = useMemo(() => {
    console.log('calculating fib value');
    return fib(num); // this is returned IF num changes
  }, [num]); // , logValue

  const onClickLog = useCallback(() => {
    console.log('clicking button ... ');
    console.log(logValue);
  }, [logValue]); // only re-render if `logValue` changes

  return (
    <>
      <h1>Fib {num} is {fibValue}</h1>
      <input
        type="number"
        value={num}
        onChange={(event) => setNum(parseInt(event.target.value))}
      />

      <input
        type="text"
        value={logValue}
        onChange={(event) => setLogValue(event.target.value)}
      />

      {
        logValue.length ?
          (
            <Suspense fallback={<div>Loading...</div>}>
              <MyButton onClick={onClickLog}>Log Value</MyButton>
            </Suspense>
          ) : 
          null
      }
    </>
  );
}

function fib(n) {
  if (n === 2) return 1;
  if (n === 1) return 0;
  return fib(n - 1) + fib(n - 2);
}
