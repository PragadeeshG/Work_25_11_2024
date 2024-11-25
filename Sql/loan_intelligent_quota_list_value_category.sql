create table if not exists loan_intelligent_quota_list_value_category(
loan_iq_source_system_value_cat_code varchar(255) not null,
loan_iq_source_system_value_cat_name varchar(255) null,
loan_iq_source_system_value_cat_description varchar(255) null,
loan_iq_source_system_value_cat_definition varchar(255) null,
authorizer_id bigint null,
owner varchar(255) null,
ps_ids varchar(255) null,
service_name_id bigint null,
creation_date varchar(255) null,
modified_date varchar(255) null,
constraint loan_intelligent_quota_list_value_category_pk primary key(loan_iq_source_system_value_cat_code));