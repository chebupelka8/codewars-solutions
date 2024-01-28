<h2>Story</h2>
Your friend Bob is working as a taxi driver. After working for a month he is frustrated in the city's traffic lights. He asks you to write a program for a new type of traffic light. It is made so it turns green for the road with the most congestion.

<h2>Task</h2>
Given 2 pairs of values each representing a road (the number of cars on it and its name), construct an object whose turngreen method returns the name of the road with the most traffic at the moment of the method call, and clears that road from cars.

After both roads are clear of traffic, or if the number of cars on both roads is the same from the beginning, return an empty value instead.

<h2>Example</h2>
```shell
t = SmartTrafficLight([42, "27th ave"], [72, "3rd st"])
t.turngreen()  ==  "3rd st"
t.turngreen()  ==  "27th ave"
t.turngreen()  ==  null

t = SmartTrafficLight([10, "27th ave"], [10, "3rd st"])
t.turngreen()  ==  null
```
