class SmartTrafficLight:
    def __init__(self, st1: list, st2: list):
        self.roads = [st1, st2]

    def turngreen(self):
        if self.roads[0][0] == self.roads[1][0]: return None

        max_count = max(self.roads, key=lambda road: road[0])
        self.roads[self.roads.index(max_count)][0] = 0

        return max_count[1]
