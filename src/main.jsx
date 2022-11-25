import React from 'react'
import ReactDOM from 'react-dom/client'
<<<<<<< HEAD
=======
import { LogisticApp } from './components/LogisticApp';
>>>>>>> 253d0ef746d3b75d0116d328243bd5a7cc83f8a6
import 'bootstrap/dist/css/bootstrap.min.css';
import { BrowserRouter } from 'react-router-dom';
import { AppRouter } from './router/AppRouter';
import '../src/index.css';
// import './index.css';

ReactDOM.createRoot(document.getElementById('root')).render(

  <BrowserRouter>
    <React.StrictMode>
      <AppRouter />
    </React.StrictMode>
  </BrowserRouter>
)
