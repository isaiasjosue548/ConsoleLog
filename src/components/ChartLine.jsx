// import "./styles.css";
import React, { useEffect, useState } from "react";
import json from '../data/ejemplo.json';

import {
  LineChart,
  Line,
  XAxis,
  YAxis,
  CartesianGrid,
  Tooltip,
} from "recharts";

const num_orders = json.num_orders;

 const names = [
    "Ener",
    "Febr",
    "Marz",
    "Abr",
    "May",
    "Jun",
    "Jul",
    "Agost",
    "Sept",
    "Oct",
    "Nov",
    "Dic",
  ]

export default function ChartLine() {

  const [data, setData] = useState([]);
  const [data2, setData2] = useState([]);

  useEffect(() => {
    const dat = Object.keys(num_orders).map((name, index) => {
      return {name : Number(name), cantidad : num_orders[name]}
    });

    const dat2 = names.map(name => {
      return {name: name, cantidad : 1}
    })

    setData(dat);
    setData2(dat2);
    console.log('dat2',dat)
  }, []);

  useEffect(() => {
    console.log(data2)
  }, [data2])
  
  
  return (
    <>
    <LineChart
      width={800}
      height={300}
      data={data}
      margin={{
        top: 5,
        right: 30,
        left: 20,
        bottom: 5
      }}
    >
      <CartesianGrid strokeDasharray="3 3" />
      {/* <XAxis dataKey="name" /> */}
      <YAxis />
      <Tooltip />
      <Line type="monotone" dataKey="cantidad" stroke="#82ca9d" />
    </LineChart>
    <LineChart
      width={800}
      height={50}
      data={data2}
      margin={{
        top: 0,
        right: 30,
        left: 80,
        bottom: 5
      }}
    >
      <Line type="monotone" dataKey="cantidad" stroke="#fff" activeDot={{ r: 12 }} />
      <XAxis dataKey="name" />
    </LineChart>
    </>
  );
}