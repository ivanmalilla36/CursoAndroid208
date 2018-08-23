var myArgs = process.argv.slice(2);
console.log('myArgs: ', myArgs);

if (myArgs[1] == "mas") {
    num1 = parseInt(myArgs[0])
    num2 = parseInt(myArgs[2])
    const x = num1 + num2
    console.log("Suma:"+x)
} else {
    if (myArgs[1] == "menos") {
        num1 = parseInt(myArgs[0])
        num2 = parseInt(myArgs[2])
        const x = num1 - num2
        console.log("Resta:"+x)
    } else {
        if (myArgs[1] == "entre") {
            num1 = parseInt(myArgs[0])
            num2 = parseInt(myArgs[2])
            const x = num1 % num2
            console.log("Division:"+x)
        } else {
            if (myArgs[1] == "por") {
                num1 = parseInt(myArgs[0])
                num2 = parseInt(myArgs[2])
                const x = num1 * num2
                console.log("Multiplicacion:"+x)
            }
        }
    }
}