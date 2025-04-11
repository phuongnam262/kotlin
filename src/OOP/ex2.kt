package OOP

open class DocGia {
    var ID_reader = ""
    var fullname_reader = ""
    var date = ""
    var gender = ""
    var numberOfBookInMonth = 0.0

    constructor()

    constructor(ID: String, fullname: String, date: String, gender: String, number: Double) {
        this.ID_reader = ID
        this.fullname_reader = fullname
        this.date = date
        this.gender = gender
        this.numberOfBookInMonth = number
    }

    constructor(dg: DocGia) {
        this.ID_reader = ID_reader
        this.fullname_reader = fullname_reader
        this.date = date
        this.gender = gender
        this.numberOfBookInMonth = numberOfBookInMonth
    }

    open fun nhapThongTin() {
        print("Nhap ma doc gia: ")
        ID_reader = readln().orEmpty()
        print("Nhap ho va ten: ")
        fullname_reader = readln().orEmpty()
        print("Nhap ngay het han: ")
        date = readln().orEmpty()
        print("nhap gioi tinh: ")
        gender = readln().orEmpty()
        print("nhap so luong sach muon trong thang: ")
        numberOfBookInMonth = readLine()?.toDoubleOrNull() ?: 0.0
    }

    open fun xuatThongTin() {
        println("Ma doc gia: $ID_reader")
        println("Ho va ten: $fullname_reader")
        println("Ngay het han: $date")
        println("Gioi tinh: $gender")
        println("So luong sach muon trong thang: $numberOfBookInMonth")
    }

    open fun lePhi(): Double {
        return 0.0
    }
}

class DocGiaThuong : DocGia {
    constructor() : super()
    constructor(dgt: DocGiaThuong) : super(dgt)

    override fun nhapThongTin() {
        super.nhapThongTin()
    }

    override fun xuatThongTin() {
        super.xuatThongTin()
        println("Le phi doc gia thuong hang thang: ${lePhi()} VNĐ")
    }

    override fun lePhi(): Double {
        return super.numberOfBookInMonth * 5000
    }
}

class DocGiaVIP : DocGia {
    constructor() : super()
    constructor(dgt: DocGiaVIP) : super(dgt)

    override fun nhapThongTin() {
        super.nhapThongTin()
    }

    override fun xuatThongTin() {
        super.xuatThongTin()
        println("Le phi doc gia VIP hang thang: ${lePhi()} VNĐ")
    }

    override fun lePhi(): Double {
        return 50000.0
    }
}

fun main() {
    val danhSachDocGia = mutableListOf<DocGia>()

    print("Nhập số lượng doc gia: ")
    val soLuong = readLine()?.toIntOrNull() ?: 0

    for (i in 1..soLuong) {
        println("\nNhập doc gia thứ $i:")
        print("Loại doc gia (1 - thuong, 2 - VIP): ")
        val loai = readLine()

        val dg = when (loai) {
            "1" -> DocGiaThuong()
            "2" -> DocGiaVIP()
            else -> {
                println("Loại không hợp lệ, bỏ qua")
                continue
            }
        }

        dg.nhapThongTin()
        danhSachDocGia.add(dg)
    }

    println("\n=== Danh sách nhân viên đã nhập ===")
    for (dg in danhSachDocGia) {
        dg.xuatThongTin()
        println("-----------------------------")
    }
}