console.log('hej hopsan');

(async () => {

    const data = await fetch('http://localhost:8080/api/v2/test')
        .then(response => response.text())
        .then(data => data)
    console.log(data);


    const product = {
        name: 'milk',
        unit: 'dl'
    }
    const p = await fetch('http://localhost:8080/api/v2/product', {
        headers: {'Content-Type': 'application/json'},
        method: 'POST',
        body: JSON.stringify(product)
    })
        .then(response => response.json())
        .then(data => data)
    console.log(p);

    const ingredient = {
        product: {
            id: 1
            // name: 'milk',
            // unit: 'dl'
        },
        amount: 2,
        unit: 'dl'
    }
    const i = await fetch('http://localhost:8080/api/v2/ingredient', {
        headers: {'Content-Type': 'application/json'},
        method: 'POST',
        body: JSON.stringify(ingredient)
    })
        .then(response => response.json())
        .then(data => data)
    console.log(i);




})()



