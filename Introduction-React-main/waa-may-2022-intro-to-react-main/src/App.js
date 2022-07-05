import logo from './logo.svg';
import React from 'react';
import './App.css';
import Login from './component/login';
import Register from './component/register';
import NoPage from './component/no_page';
import { BrowserRouter, Routes, Route } from "react-router-dom";

function App() {
  return (
    <BrowserRouter>
      <div className='App'>
        <Routes>
          <Route exact path = "/" element={<Login/>}/>
          <Route exact path = "/signup" element={<Register/>}/>
          <Route path="*" element={<NoPage />} />
        </Routes>
   </div>
    </BrowserRouter>
   
  );
}

export default App;
