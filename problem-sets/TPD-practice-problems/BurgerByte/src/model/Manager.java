package model;

import java.util.LinkedList;
import java.util.List;

public class Manager extends Employee {

    public static final double MANAGER_WAGE = 9.50;

    private BurgerByte managingBranch;
    private List<Employee> team;

    public Manager(String name, int age) {
        super(name, age);
        team = new LinkedList<>();
    }

    // getters
    public BurgerByte getManagingBranch() { return managingBranch; }
    public List<Employee> getTeam() { return team; }

    // REQUIRES: hours >= 0
    // MODIFIES: this
    // EFFECTS: opens this Manager's BurgerByte, sets atWork to true, and logs
    //          hours worked
    @Override
    public void startWork(double hours) {
        managingBranch.openRestaurant();
        atWork = true;
        logHoursWorked(hours);
        System.out.println("We are open for the day!");
    }

    // MODIFIES: this
    // EFFECTS: closes this Manager's BurgerByte, set atWork to false
    @Override
    public void leaveWork() {
        managingBranch.closeRestaurant();
        atWork = false;
        System.out.println("We are closed for the day!");
    }

    // EFFECTS: set this managingBranch to managingBranch
    public void setManagingBranch(BurgerByte managingBranch) {
        this.managingBranch = managingBranch;
    }

    // REQUIRES: c must not be in already in team and this Manager's restaurant
    // MODIFIES: this
    // EFFECTS: adds given c to team and this Manager's restaurant
    public void hire(Employee c) {
        managingBranch.addStaff(c);
        team.add(c);
        System.out.println("Welcome aboard, " + c.getName() + "!");
    }

    // REQUIRES: fc must be in this team and and this Manager's restaurant
    // MODIFIES: this
    // EFFECTS: removes given fc from team and this Manager's restaurant
    public void fire(Employee fc) {
        managingBranch.removeStaff(fc);
        team.remove(fc);
        System.out.println("Sorry to let you go, " + fc.getName() + ".");
    }

    @Override
    public double computeWage() {
        return (hoursWorked * (Manager.MANAGER_WAGE + BASE_WAGE));
    }
}