package com.itsuhbat.CRM.markets;

import com.itsuhbat.CRM.parts.Parking;
import com.itsuhbat.CRM.parts.Storage;
import com.itsuhbat.CRM.personnel.Department;
import com.itsuhbat.CRM.personnel.User;

public class HyperMarket extends SuperMarket{
    Parking parking;
    Department[] departments;
    Storage[] storages;             // sumkalar uchun joylar
    User[] users;
}
