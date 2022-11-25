import React from 'react'
import ReactDOM from 'react-dom/client'
import 'bootstrap/dist/css/bootstrap.min.css';
// import { AppRouter } from './router/AppRouter';
import '../src/index.css';
import { LogisticApp } from './components/LogisticApp';
// import './index.css';

ReactDOM.createRoot(document.getElementById('root')).render(

    <React.StrictMode>
      <LogisticApp />
    </React.StrictMode>
)
