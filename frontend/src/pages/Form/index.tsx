import FormCard from "components/FormCard"
import { useParams } from "react-router-dom"

function Form(){

    const params = useParams()

    return (
        <FormCard carId={`${params.carId}`}/>
    )
}

export default Form