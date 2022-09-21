import CarScore from "components/CarScore";
import { Link } from "react-router-dom";
import { Car } from "types/car";

type Props = {
    car: Car
}

function CarCard({car}: Props){

    

    return (
        <div>
            <img className="dscar-car-card-image" src={car.image} alt={car.name} />
            <div className="dscar-card-bottom-container">
                <h3>{car.name}</h3>
                <CarScore count={car.count} score={car.score}/>
                <Link to={`/form/${car.id}`}>
                    <div className="btn btn-primary dscar-btn">Avaliar</div>
                </Link>
        </div>
        </div>
    )
}

export default CarCard