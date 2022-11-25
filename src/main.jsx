import React from 'react'
import ReactDOM from 'react-dom/client'
import { LogisticApp } from './components/LogisticApp';
import ChartLine from './components/ChartLine'
import 'bootstrap/dist/css/bootstrap.min.css';
// import './index.css';

ReactDOM.createRoot(document.getElementById('root')).render(
  <React.StrictMode>
    <LogisticApp />
    <ChartLine />
  </React.StrictMode>
)
