import React, { useEffect, useState } from 'react'
import { Navbar } from './Navbar'
import Search from './search'
import ChartLine from './ChartLine'

export const LogisticApp = () => {
  const [count, setCount] = useState('');

  useEffect(() => {
    console.log(count);
  }, [count])
  

  return (
    <>
      <Navbar/> 
      <Search setCount={setCount}/>
      <ChartLine result={count}/>
    </>
  )
}
