package Packages.Laboratory13;

import Packages.Laboratory13.package1.*;
import Packages.Laboratory13.package1.PackageTester;
import Packages.Laboratory13.package2.*;
import Packages.Laboratory13.package3.*;

public class PackageTesterApp {


    public static void main(String[] args) {
        Packages.Laboratory13.package1.PackageTester a = new Packages.Laboratory13.package1.PackageTester();
        Packages.Laboratory13.package2.PackageTester b = new Packages.Laboratory13.package2.PackageTester();
        Packages.Laboratory13.package3.PackageTester c = new Packages.Laboratory13.package3.PackageTester();
        a.introduce();
        b.introduce();
        c.introduce();
    }





}
