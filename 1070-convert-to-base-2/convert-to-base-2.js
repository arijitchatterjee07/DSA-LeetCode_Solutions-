/**
 * @param {number} n
 * @return {string}
 */
var baseNeg2 = function(n) 
{
    if (n === 0)
    {
        return "0";
    }
    let result = "";
    while (n !== 0) {
        let remainder = n % -2;
        n = Math.trunc(n / -2);
        if (remainder < 0) 
        {
            remainder += 2;
            n += 1;
        }
        result = remainder + result;
    }
    return result;
};