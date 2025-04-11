package OOP


open class NhanVien {
    var idStaff: String = ""
    var fullName: String = ""
    var birth: String = ""
    var address: String = ""

    constructor()
    constructor(idStaff: String, fullName: String) {
        this.idStaff = idStaff
        this.fullName = fullName
    }

    constructor(idStaff: String, fullName: String, birth: String) {
        this.idStaff = idStaff
        this.fullName = fullName
        this.birth = birth
    }

    constructor(idStaff: String, fullName: String, birth: String, address: String) {
        this.idStaff = idStaff
        this.fullName = fullName
        this.birth = birth
        this.address = address
    }

    constructor(nv: NhanVien) {
        this.idStaff = idStaff
        this.fullName = fullName
        this.birth = birth
        this.address = address
    }

    open fun nhapThongtin() {
        print("Nhap ma nhan vien: ")
        idStaff = readln().orEmpty()
        print("Nhap ho va ten: ")
        fullName = readln().orEmpty()
        print("Nhap ngay sinh: ")
        birth = readln().orEmpty()
        print("Nhap dia chi: ")
        address = readln().orEmpty()
    }

    open fun xuatThongtin() {
        println("Ma NV: $idStaff")
        println("Ho va ten : $fullName")
        println("Ngay sinh: $birth")
        println("Dia chi: $address")
    }

    open fun tinhLuong(): Double {
        return 0.0
    }
}


class NVSanXuat : NhanVien {
    var soSanPham = 0;

    constructor() : super()
    constructor(idStaff: String, fullName: String) : super(idStaff, fullName)
    constructor(idStaff: String, fullName: String, birth: String) : super(idStaff, fullName, birth)
    constructor(idStaff: String, fullName: String, birth: String, address: String, soSanPham: Int) : super(
        idStaff,
        fullName,
        birth,
        address
    ) {
        this.soSanPham = soSanPham
    }

    constructor(nv: NVSanXuat, soSanPham: Int) : super(nv) {
        this.soSanPham = soSanPham
    }

    override fun nhapThongtin() {
        super.nhapThongtin()
        print("Nhap so san pham: ")
        soSanPham = readln().toInt()
    }

    override fun xuatThongtin() {
        super.xuatThongtin()
        println("So san pham: $soSanPham")
        println("Luong: ${tinhLuong()} VNĐ")
    }

    override fun tinhLuong(): Double {
        return soSanPham * 20000.0
    }
}

class NVCongNhat : NhanVien {
    var soNgay = 0;

    constructor() : super()
    constructor(idStaff: String, fullName: String) : super(idStaff, fullName)
    constructor(idStaff: String, fullName: String, birth: String) : super(idStaff, fullName, birth)
    constructor(idStaff: String, fullName: String, birth: String, address: String, soNgay: Int) : super(
        idStaff,
        fullName,
        birth,
        address
    ) {
        this.soNgay = soNgay
    }

    constructor(nv: NVSanXuat, soNgay: Int) : super(nv) {
        this.soNgay = soNgay
    }

    override fun nhapThongtin() {
        super.nhapThongtin()
        print("Nhap so ngay cong:")
        soNgay = readln().toInt()
    }

    override fun xuatThongtin() {
        super.xuatThongtin()
        println("So ngay di lam: $soNgay")
        println("Luong: ${tinhLuong()} VNĐ")
    }

    override fun tinhLuong(): Double {
        return soNgay * 300000.0
    }

}

//fun main() {
//    val danhSachNV = mutableListOf<NhanVien>()
//
//    print("Nhập số lượng nhân viên: ")
//    val soLuong = readLine()?.toIntOrNull() ?: 0
//
//    for (i in 1..soLuong) {
//        println("\nNhập nhân viên thứ $i:")
//        print("Loại nhân viên (1 - SX, 2 - CN): ")
//        val loai = readLine()
//
//        val nv = when (loai) {
//            "1" -> NVSanXuat()
//            "2" -> NVCongNhat()
//            else -> {
//                println("Loại không hợp lệ, bỏ qua")
//                continue
//            }
//        }
//
//        nv.nhapThongtin()
//        danhSachNV.add(nv)
//    }
//
//    println("\n=== Danh sách nhân viên đã nhập ===")
//    for (nv in danhSachNV) {
//        nv.xuatThongtin()
//        println("-----------------------------")
//    }
//}