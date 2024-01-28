function sumTwoSmallestNumbers(numbers) {
    let res = 0;

    res += Math.min(...numbers);
    numbers.splice(numbers.indexOf(res), 1);

    res += Math.min(...numbers);

    return res;
}