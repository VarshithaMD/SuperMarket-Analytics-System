import React, { useEffect, useState } from 'react';
import ProductCard from './ProductCard';
import axios from 'axios';

const categories = ['Book', 'Chocolate', 'Ice Cream', 'Grocery'];

export default function ProductList() {
    const [products, setProducts] = useState([]);
    const [selected, setSelected] = useState('Book');

    useEffect(() => {
        axios.get(`/api/products/category/${selected}`).then((res) => {
            setProducts(res.data);
        });
    }, [selected]);

    return (
        <div>
            <h1 className="text-2xl font-bold mb-4">Products - {selected}</h1>
            <div className="flex gap-4 mb-6">
                {categories.map(cat => (
                    <button
                        key={cat}
                        onClick={() => setSelected(cat)}
                        className={`px-4 py-2 rounded ${selected === cat ? 'bg-blue-500 text-white' : 'bg-gray-200'}`}
                    >
                        {cat}
                    </button>
                ))}
            </div>

            <div className="grid grid-cols-3 gap-6">
                {products.map(prod => (
                    <ProductCard key={prod.id} product={prod} />
                ))}
            </div>
        </div>
    );
}
