# PlingPlangPlong
It plings, it plangs, it plongs.
Sometimes it does all three, sometimes it does none.
Let's go on a journey to discover which.

## Brief
Write a function that takes in a number (n) and gives out a string, the contents of which depend on the numbers factors


- if the number has a factor of 3, output 'Pling'
- if the number has a factor of 5, output 'Plang'
- if the number has a factor of 7, output 'Plong'
- if the number does not have any of the above as a factor simply return the numbers digits



## Examples


- 28 has factors of 1, 2, 4 and **7** (14 and 28) giving 'Plong'
- 30 has 1, 2, **3**, **5**, 6 (10, 15, 30), so this would be 'PlingPlang'
- 34 would just return the input '34' as it's four factors, 1, 2, 17, (and 34), do not match the desired factors

Project has been thoroughly tested with 92% line coverage (this is due to a static method being used)
![Mutation Test and Coverage](https://user-images.githubusercontent.com/54250624/168990828-b19e57ce-6c2a-43a2-956d-67433f49684c.png)

![testexample](https://user-images.githubusercontent.com/54250624/168993105-786fd57f-8704-4d95-a3ad-8816280739da.png)

![testspassed](https://user-images.githubusercontent.com/54250624/168992677-1495e776-5bf6-4f84-b21d-dc6012f67a89.png)

![testslist](https://user-images.githubusercontent.com/54250624/168992644-8761585d-98c4-4878-9486-3fcda809b3a2.png)
