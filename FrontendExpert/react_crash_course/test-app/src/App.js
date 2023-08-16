import { useReducer, useState } from "react";

function reducer(state, action) {
  switch (action.type) {
    case 'increment':
      //return {count: state.count + 1} 
      return {count: state.count + action.num}; // return an object with the new state
    case 'decrement':
      return {count: state.count - action.num};
    default:
      throw new Error('Unknown action type');
          
      
  }
}

export default function App() {
  const [state, dispatch ] = useReducer(reducer, {
    count: 0
  });
  
  return (
    <>
      <Counter
        count={state.count}
        onClick={() => dispatch({ // dispatch: calls the reducer (has to take in the reducer's action!)
          type: 'increment',
          num: 1 // increment by 1
        })} /> 

      <Counter
        count={state.count}
        onClick={() => dispatch({
          type: 'decrement',
          num: 100
        })} /> 
      
    </>
  );
}

function Counter({count, onClick}) { // change this to onClick
  return (
    <>
      <button onClick={onClick}> {/* change this to onClick */}
          Increment
      </button>
      <p>Count: {count}</p>
    </>
  );
}
