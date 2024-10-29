Here’s a README file for the code based on the files you've provided:

---

# Geometri Project

This project contains Java classes that represent geometric shapes and provide functionality to calculate their properties. The main classes are `Geometri`, `Geovar`, and `HitungLuasGeometri`, which are designed to work together to represent geometric shapes and calculate their areas.

## Project Structure

### 1. Geometri.java
The `Geometri` class represents a geometric shape with three main attributes:
- `alas` (base)
- `sisi` (side)
- `tinggi` (height)

#### Key Methods
- **Constructor**: Initializes `alas`, `sisi`, and `tinggi` based on values from an instance of `Geovar`.
- **tampilkanNilai()**: Displays the values of `alas`, `sisi`, and `tinggi`.
- **Getter and Setter Methods**: Allows accessing and modifying the values of `alas`, `sisi`, and `tinggi`.

### 2. Geovar.java
The `Geovar` class serves as a data structure to store the initial values for the `Geometri` class. This class provides getter methods (likely using records or simple getter functions) to access values for `alas`, `sisi`, and `tinggi`.

### 3. HitungLuasGeometri.java
The `HitungLuasGeometri` class provides methods to calculate the area of various geometric shapes using the attributes from an instance of `Geometri`. It can calculate areas based on the provided values of base (`alas`), side (`sisi`), and height (`tinggi`).

#### Key Methods
- **Method to Calculate Area**: Specific methods for calculating area based on the geometry type (such as triangles, squares, or rectangles).

## Usage

1. **Initialization**: Create an instance of `Geovar` to store initial values.
2. **Create Geometri Object**: Use the `Geovar` instance to initialize a `Geometri` object.
3. **Display Values**: Call `tampilkanNilai()` on the `Geometri` instance to view base, side, and height.
4. **Calculate Area**: Use `HitungLuasGeometri` to calculate the area based on the shape's attributes.

## Example

```java
// Initialize values using Geovar
Geovar geovar = new Geovar(10, 5, 8);

// Create Geometri object
Geometri geometri = new Geometri(geovar);

// Display values
geometri.tampilkanNilai();

// Calculate area using HitungLuasGeometri
HitungLuasGeometri hitungLuas = new HitungLuasGeometri(geometri);
double area = hitungLuas.calculateArea();
System.out.println("Area: " + area);
```

## Requirements
- Java Development Kit (JDK) version 8 or higher

## License
This project is open source and available under the MIT License.

---

This README file provides an overview, usage example, and instructions for working with the classes in the project. Let me know if you'd like further customization or details!