package com.ibm.health.analytics.ascvd.interop;

public enum AscvdInputValidationFailureReason {
	MISSING_AGE,
	MISSING_IS_MALE,
	MISSING_IS_AFRICAN_AMERICAN,
	MISSING_IS_BP_TREATED,
	MISSING_CURRENT_SMOKER,
	MISSING_IS_DIABETIC,
	MISSING_TOTAL_CHOLESTEROL,
	MISSING_HDL_CHOLESTEROL,
	MISSING_SYSTOLIC_BP,
	
	INVALID_AGE,
	INVALID_TOTAL_CHOLESTEROL,
	INVALID_HDL_CHOLESTEROL,
	INVALID_SYSTOLIC_BP,
	
	HAD_PRIOR_ASCVD_EVENT;
}
