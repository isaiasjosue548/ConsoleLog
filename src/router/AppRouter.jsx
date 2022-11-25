import React from 'react'
import { Route, Routes } from 'react-router'
import { LogisticApp } from '../layout/LogisticApp'



export const AppRouter = () => {
  return (
    <Routes>
            <Route path='/' element={<LogisticApp />}/>
    </Routes>
  )
}
