import {ReactComponent as GithubIcon} from 'assets/img/github.svg'
import './styles.css'
function Navbar() {
    return (
        <header>
        <nav className="container">
            <div className="dscar-nav-content">
                <h1>DSCar</h1>
                <a href="https://github.com/devsuperior" target="_blank" rel="noreferrer">
                    <div className="dscar-contact-container">
                        <GithubIcon />
                        <p className="dscar-contact-link">/devsuperior</p>
                    </div>
                </a>
            </div>
        </nav>
    </header>
    )
}

export default Navbar