import CarStars from "components/CarStars";
import './styles.css'

type Props = {
    score: number,
    count: number
}

function CarScore( {score, count}: Props){

    return (
        <div className="dscar-score-container">
            <p className="dscar-score-value">{score > 0 ? score.toFixed(1) : '-'}</p>
            <CarStars score={score}/>
            <p className="dscar-score-count">{count} avaliações</p>
        </div>
    )
}

export default CarScore