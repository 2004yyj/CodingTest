# 1000이하의 자연수를 입력하고
# 그 사이에 3과 5의 모든 배수를 더하는 문제

user_input = int(input())
result = 0
for i in range(1, user_input + 1):
	if (i % 3 == 0) or (i % 5 == 0):
		result+=i

print(result)