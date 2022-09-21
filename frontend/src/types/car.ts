export type Car = {
    id: number;
    name: string;
    score: number;
    count: number;
    image: string;
}

export type CarPage = {
    content: Car[];
    last: boolean;
    totalPages: number;
    totalElements: number;
    size: number;
    number: number;
    first: boolean;
    numberOfElements: number;
    empty: boolean;
}