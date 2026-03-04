package org.idempiere.zkee.comps.example;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.zkoss.bind.annotation.Command;
import org.zkoss.zk.ui.util.Clients;

public class ExampleVM {
	private Date selectedTime = new Date();

	public Date getSelectedTime() {
		return selectedTime;
	}

	public void setSelectedTime(Date selectedTime) {
		this.selectedTime = selectedTime;
	}

	@Command
	public void showNotification() {
		String timeText = selectedTime == null ? "(empty)"
				: new SimpleDateFormat("yyyy/MM/dd HH:mm").format(selectedTime);
		Clients.showNotification("Command triggered. Time: " + timeText);
	}
}
