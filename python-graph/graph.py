import pandas as pd
import matplotlib.pyplot as plt

df = pd.read_csv("results.csv")

plt.plot(df["VM"], df["Energy"], marker='o')
plt.xlabel("VM")
plt.ylabel("Energy Consumption")
plt.title("Energy-Efficient Scheduling Results")
plt.grid(True)

# SAVE IMAGE (important)
plt.savefig("graph.png", dpi=300, bbox_inches='tight')

plt.show()