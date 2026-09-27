/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.hospractise;

/**
 *
 * @author Student
 */
public class HosPractise {

    public static void main(String[] args) {
       

String[] hospitalNames = {"Milpark", "Netcare", "Life Fourways"};
int[][] numberOfPatients = {
{210, 145},
{178, 162},
{132, 198}
};
int[] totals = new int[hospitalNames.length];
// LOOP 1: calculate row totals
for (int row = 0; row < numberOfPatients.length; row++) {
int total = 0;
for (int col = 0; col < numberOfPatients[row].length; col++) {
total = total + numberOfPatients[row][col];
}
totals[row] = total;
}
// LOOP 2: bubble sort by totals (ascending)
for (int i = 0; i < totals.length - 1; i++) {
for (int j = 0; j < totals.length - 1 - i; j++) {
if (totals[j] > totals[j + 1]) {
int tempTotal = totals[j];
totals[j] = totals[j + 1];
totals[j + 1] = tempTotal;
String tempName = hospitalNames[j];
hospitalNames[j] = hospitalNames[j + 1];
hospitalNames[j + 1] = tempName;
int temp0 = numberOfPatients[j][0];
int temp1 = numberOfPatients[j][1];
numberOfPatients[j][0] = numberOfPatients[j + 1][0];
numberOfPatients[j][1] = numberOfPatients[j + 1][1];
numberOfPatients[j + 1][0] = temp0;
numberOfPatients[j + 1][1] = temp1;
}
}
}
// LOOP 3: find highest
int highest = totals[0];
String highestHospital = hospitalNames[0];
for (int row = 1; row < totals.length; row++) {
if (totals[row] > highest) {
highest = totals[row];
highestHospital = hospitalNames[row];
}
}
// LOOP 4: print
System.out.println("HOSPITAL ADMISSION REPORT");
for (int row = 0; row < hospitalNames.length; row++) {
System.out.println(hospitalNames[row] 
 + " - Emergency: " + numberOfPatients[row][0]
 + " - Surgery: " + numberOfPatients[row][1]);
}
System.out.println("ADMISSION TOTALS");
for (int row = 0; row < hospitalNames.length; row++) {
System.out.println(hospitalNames[row] + " - Total: " + totals[row]);
}
System.out.println("HOSPITAL WITH MOST ADMISSIONS: " + highestHospital);
}
}
    

