import React from 'react'
import brand from "/public/brand-logo.png";

export const Navbar = () => {

  return (
    <nav className="navbar navbar-expand-lg navbar-dark bg-primary">
        <div className="container-fluid">
            <button className="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
            <span className="navbar-toggler-icon"></span>
            </button>
            <div className="collapse navbar-collapse" id="navbarSupportedContent">
            <ul className="navbar-nav me-auto mb-2 mb-lg-0">
                <li className="nav-item">
                <a className="nav-link active" aria-current="page" href="#">
                    <img style={{width: "100px" }} src={brand} alt="logo" />
                </a>
    
                </li>
                    <a class="nav-link active" aria-current="page" href="#">Bon Digital Talent</a>
                    <a class="nav-link active" aria-current="page" href="#">MWC Supermercados</a>
                    <a class="nav-link active" aria-current="page" href="#">MercatBDT</a>
            </ul>
            <form className="d-flex" role="search">
                <input className="form-control me-2" type="search" placeholder="Search" aria-label="Search" />
                <button className="btn btn-dark" type="submit">Search</button>
            </form>
            </div>
        </div>
</nav>
  )
}
