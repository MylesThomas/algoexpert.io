export default function App() {
  return (
    <MyButton onClick={handleClick}>Click Me</MyButton>
  );
}

function handleClick(event) {
  console.log(event);
};

function MyButton(props) {
  // make sure to add onClick={props.onClick}, or else the console won't log the event!
  // even better: use the spread syntax (...props) so that it inherits more than just onClick!
  return (
    <button
      {...props}
      style={{
        color: 'red'
      }}>
      {props.children}
    </button>
  );
}
