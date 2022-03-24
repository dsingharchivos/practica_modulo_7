<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="es">
  <head>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <meta http-equiv="X-UA-Compatible" content="ie=edge" />
    <link rel="stylesheet" href="css/estilos.css" />
    <title>Practica de JPA</title>
  </head>
  <body>
    <div class="clsContenedor">
      <div>
        <form class="clsFormulario" action="" method="">
          <h4>ALTA DE EXPERIENCIA LABORAL</h4>
          <input
            class="clsInput"
            type="text"
            name="empresa"
            id="empresa"
            placeholder="Ingrese la Empresa"
          />
          <input
            class="clsInput"
            type="text"
            name="puesto"
            id="puesto"
            placeholder="Ingrese el Puesto"
          />
          <input
            class="clsInput"
            type="text"
            name="anio_ingreso"
            id="anio_ingreso"
            placeholder="Ingrese el Año Ingreso"
          />
          <input
            class="clsInput"
            type="text"
            name="anio_egreso"
            id="anio_egreso"
            placeholder="Ingrese el Año Egreso"
          />
          <button class="clsBotones" type="submit">ALTA</button>
        </form>
      </div>
      <div>
        <form class="clsFormulario" action="" method="">
          <h4>BAJA DE EXPERIENCIA LABORAL</h4>
          <input
            class="clsInput"
            type="text"
            name="id"
            id="id"
            placeholder="Ingrese el ID a Eliminar"
          />
          <button class="clsBotones" type="submit">BAJA</button>
        </form>
      </div>
        <div>
        <form class="clsFormulario" action="" method="">
          <h4>LISTADO DE EXPERIENCIA LABORAL</h4>
         
          <button class="clsBotones" type="submit">LISTAR</button>
        </form>
      </div>
        
    </div>
  </body>
</html>
