package app.reception.vo;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class WardVO {
	int admission_record_id, ward_id, medical_record_id, bed, ward_number;
	String doctor_name, department_name,patient_name, 
	admission_date, admission_time,admission_day,
	discharge_date,discharge_time, discharge_day	
	;
}
