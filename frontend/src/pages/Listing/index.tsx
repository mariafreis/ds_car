import axios from "axios";
import CarCard from "components/CarCard";

import Pagination from "components/Pagination";
import { useEffect, useState } from "react";
import { CarPage } from "types/car";
import { BASE_URL } from "utils/requests";

function Listing(){

    const [pageNumber, setPageNumber] = useState(0)

    const [page, setPage] = useState<CarPage>({
        content: [],
        last: true,
        totalPages: 0,
        totalElements: 0,
        size: 12,
        number: 0,
        first: true,
        numberOfElements: 0,
        empty: true
    })

    
    useEffect(() => {
        axios.get(`${BASE_URL}/cars?size=12&page=${pageNumber}&sort=id `)
        .then(response => {
            const cars = response.data as CarPage
            setPage(cars)
        })
    }, [pageNumber])
  
    const handlePageChange = (newPageNumber: number) => {
        setPageNumber(newPageNumber)
    }

    return (
        <>
            <Pagination page={page} onChange={handlePageChange}/>
            <div className="container">
                <div className="row">
                    
                    {page.content.map(car => (

                        <div key={car.id} className="col-sm-6 col-lg-4 col-xl-3">
                        <CarCard car={car}/>
                    </div>
                    ))}
                    
                </div>
            </div>
            
            
        </>
    )
}

export default Listing