import React from 'react';
import { Bar } from 'react-chartjs-2';

export default function ProductChart({ stock, sales }) {
    const data = {
        labels: ['Stock', 'Sales'],
        datasets: [
            {
                label: 'Inventory',
                data: [stock, sales],
                backgroundColor: ['#34d399', '#60a5fa'],
            },
        ],
    };

    return <Bar data={data} />;
}
