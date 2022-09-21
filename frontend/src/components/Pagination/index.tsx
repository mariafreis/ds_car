import {ReactComponent as Arrow} from 'assets/img/arrow.svg'
import { CarPage } from 'types/car'
import './styles.css'

type Props = {
    page: CarPage;
    onChange: Function;
}

function Pagination( {page, onChange}: Props){
    return (
        <div className="dscar-pagination-container">
            <div className="dscar-pagination-box">
                <button className="dscar-pagination-button" disabled={page.first} 
                    onClick={() => onChange(page.number - 1)}>
                    <Arrow />
                </button>
                <p>{`${page.number+1} de ${page.totalPages}`}</p>
                <button className="dscar-pagination-button" disabled={page.last} 
                    onClick={() => onChange(page.number + 1)}>
                    <Arrow className="dscar-flip-horizontal" />
                </button>
            </div>
        </div>
    )
}

export default Pagination