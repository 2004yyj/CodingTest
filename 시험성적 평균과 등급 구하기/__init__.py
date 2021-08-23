# -*- coding: utf-8 -*-
# UTF-8 encoding when using korean
sum_score = 0
score_list = list(map(int, input().split()))
for i in range(0, len(score_list)):
	sum_score += score_list[i]
avg_score = sum_score / 3

print("%0.2f" % avg_score, end = ' ')

if avg_score >= 90:
	print('A')
elif 90 > avg_score >= 80:
	print('B')
elif 80 > avg_score >= 70:
	print('C')
elif 70 > avg_score >= 60:
	print('D')
else:
	print("F")