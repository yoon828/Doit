import logo from './logo.svg';
import './App.css';
import { useState,useEffect } from 'react';
import axios from 'axios';

function App() {
  const [title, setTitle] = useState("");
  useEffect(() => {
    axios.get("http://3.34.61.31:8080/api").then((res)=>{
      console.log(res);
    setTitle(res.data);
    })
  
  }, [])
  
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
          <h2>Test!!!!!!!
          </h2>
          <h6>{title}</h6>
          
        </a>
      </header>
    </div>
  );
}

export default App;
