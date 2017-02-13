package problem4;

public class Problem2 {

	public void setAlerts (double fuel_level, Problem2Class alerts) {

		alerts.setChime(false); alerts.setRed_light(false); alerts.setYellow_light(false); alerts.setGreen_light(false);
		if (fuel_level<10.0)
			alerts.setChime(true);
		else
			if (fuel_level<20.0)
				alerts.setRed_light(true);
			else
				if (fuel_level<30.0)
					alerts.setYellow_light(true);
				else
					if (fuel_level<100.0)
						alerts.setGreen_light(true);
		}
}
