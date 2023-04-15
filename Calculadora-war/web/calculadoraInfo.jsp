<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Calculadora</title>
    </head>
    <body>
        <h1>Calculadora</h1>
        <form action="./CalculadoraServlet" method="POST">
            <table>
                <tr>
                    <td>Numero 1</td>
                    <td><input type="text" name="a" /></td>
                </tr>
                <tr>
                    <td>Numero 2</td>
                    <td><input type="text" name="b"  /></td>
                </tr>
                <tr>
                    <td colspan="2">
                        <input type="submit" name="action" value="Suma" />
                        <input type="submit" name="action" value="Resta" />
                        <input type="submit" name="action" value="Exponente" />
                        <input type="submit" name="action" value="Multiplicar" />
                        <input type="submit" name="action" value="Dividir" />
                        <input type="submit" name="action" value="Modulo" />
                    </td>
                </tr>
            </table>
        </form>
    </body>
</html>
