import { Component, useState, createRef, createContext } from 'react';

const Theme = createContext({
  mode: 'dark'
});

export default function App() {
  const [shouldRender, setShouldRender] = useState(true);
  return (
    <Theme.Provider value={{mode: 'dark'}}>
      {/* <Counter startingCount={10} /> */}
      { shouldRender && <Counter /> }
      <button onClick={() => setShouldRender(!shouldRender)}>
        Toggle Counter
      </button>
    </Theme.Provider>
  );
}

class Counter extends Component {
  static contextType = Theme;
  constructor(props) {
      super(props);
      this.state = {
          count: props.startingCount ?? 0
      };
      this.buttonRef = createRef();
  }

  componentDidMount() {
    console.log(this.context);
  }

  render() {
    // console.log(this.buttonRef); 
    // (this would return null - the first time render is called, the component is not mounted on the screen - nothing to set the ref to!)
    return (
      <>
        <button ref={this.buttonRef} onClick={() => {
          this.setState({
            count: this.state.count + 1
          });
        }}>
          Increment
        </button>
        <p>Count: {this.state.count}</p>
        {/* <p>Theme: {this.context.mode}</p> */}
        <Theme.Consumer>
          {
            context => <p>Theme: {context.mode}</p>
          }
        </Theme.Consumer>
      </>
    );
  }
}
