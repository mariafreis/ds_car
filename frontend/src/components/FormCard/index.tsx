import axios, { AxiosRequestConfig } from 'axios';
import { useEffect, useState } from 'react';
import { Link, useNavigate} from 'react-router-dom';
import { Car } from 'types/car';
import { BASE_URL } from 'utils/requests';
import { validateEmail } from 'utils/validate';
import './styles.css'

type Props = {
    carId: string
}
function FormCard( {carId}: Props){

    const [car, setCar] = useState<Car>()

    const navigate = useNavigate()

    useEffect(() => {
        axios.get(`${BASE_URL}/cars/${carId}`)
        .then( response => {
            setCar(response.data)
        })
    }, [carId])
    
    const handleSubmit = (event: React.FormEvent<HTMLFormElement>) => {
        event.preventDefault()
        const email = (event.target as any).email.value
        const score = (event.target as any).score.value
        if (!validateEmail(email)){
            return 
        }

        const config: AxiosRequestConfig = {
            baseURL: BASE_URL,
            method: 'PUT',
            url: '/scores',
            data: {
                email: email,
                carId: carId,
                score: score
            }
        }

        axios(config)
        .then(response => {
            navigate("/")
        })
    }
    return (
        <div className="dscar-form-container">
            <img className="dscar-car-card-image" src={car?.image} alt={car?.name} />
            <div className="dscar-card-bottom-container">
                <h3> {car?.name}</h3>
                <form className="dscar-form" onSubmit={handleSubmit}>
                    <div className="form-group dscar-form-group">
                        <label htmlFor="email">Informe seu email</label>
                        <input type="email" className="form-control" id="email" />
                    </div>
                    <div className="form-group dscar-form-group">
                        <label htmlFor="score">Informe sua avaliação</label>
                        <select className="form-control" id="score">
                            <option>1</option>
                            <option>2</option>
                            <option>3</option>
                            <option>4</option>
                            <option>5</option>
                        </select>
                    </div>
                    <div className="dscar-form-btn-container">
                        <button type="submit" className="btn btn-primary dscar-btn">Salvar</button>
                    </div>
                </form >
                <Link to="/">
                    <button className="btn btn-primary dscar-btn mt-3">Cancelar</button>
                </Link>
                
            </div >
        </div >
    )
}


export default FormCard