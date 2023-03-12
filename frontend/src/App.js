import logo from './logo.svg';
import './App.css';
import { useState,useEffect } from 'react';
import axios from 'axios';

function App() {
  const [title, setTitle] = useState("");
  useEffect(() => {
    (async () => {
      const {data} = await axios.get("http://3.34.61.31/api");
      console.log(data);
      setTitle(data);
    })();
  }, []);
  
  return (
    <div className="App">
      <header className="App-header">
        <img src={logo} className="App-logo" alt="logo" />
        <p>
          Edit <code>src/App.js</code> and save to reload.
        </p>
        <a
          className="App-link"
          href="https://reactjs.org"
          target="_blank"
          rel="noopener noreferrer"
        >
          Learn React
        </a>
          <h2>Test!!!!!!!</h2>
          <h5>backend test : {title}</h5>
      </header>
    </div>
  );
}

export default App;
