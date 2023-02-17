package app.reception.vo;

import java.io.Serializable;
import java.sql.Date;

import lombok.Getter;
import lombok.Setter;


@Getter @Setter
public class MedicalReceiptVO implements Serializable {
	private int patient_id, staff_id;
	private String time, reserve_date, reserve_date_short, reserve_time, reserve_today, 
			      reserve_time_count, current_time, reserve_day,
				memo, doctor_name, patient_name, department_name, location;

}
