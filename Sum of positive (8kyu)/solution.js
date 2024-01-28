function positiveSum(arr) {
  let sum = 0

  for (i in arr)
    {
      if (arr[i] > 0)
        {
          sum += arr[i]
        }
    }

  return sum;
}