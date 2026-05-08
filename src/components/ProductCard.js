import React from 'react';
import ProductChart from './ProductChart';

export default function ProductCard({ product }) {
    return (
        <div className="p-4 border rounded shadow">
            <img src={product.imageUrl} alt={product.name} className="w-full h-40 object-cover mb-2" />
            <h2 className="text-lg font-semibold">{product.name}</h2>
            <p>Price: ₹{product.price}</p>
            <p>Stock: {product.stock}</p>
            <p>Sales: {product.sales}</p>
            <ProductChart stock={product.stock} sales={product.sales} />
        </div>
    );
}
