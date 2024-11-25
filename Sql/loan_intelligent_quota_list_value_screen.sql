create table if not exists loan_intelligent_quota_list_value_screen(
screen_id Integer not null,
source_system_code Integer null,
federal_scheme varchar(255) null,
reporting_regime varchar(255) null,
revenue_service varchar(255) null,
action_ids varchar(255) null,
creation_date varchar(255) null,
modified_date varchar(255) null,
entity_state varchar(255) null,
constraint loan_intelligent_quota_list_value_screen_pk primary key(screen_id));