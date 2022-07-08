def squareroot(number):
    start = 0
    end, ans = number, 1
    while start <= end:
        mid = int((start + end) / 2)

        if mid * mid == number:
            ans = mid
            break
        if mid * mid < number:
            start = mid + 1
        else:
            end = mid - 1
        ans = -1
    return ans


print(squareroot(49))
print(squareroot(10))

