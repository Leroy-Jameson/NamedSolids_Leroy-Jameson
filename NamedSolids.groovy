double size =20
return [
new Dodecahedron(size).toCSG().movex(size*0),
new Icosahedron(size).toCSG().movex(size*2),
new Octahedron(size).toCSG().movex(size*6),
new Tetrahedron(size).toCSG().movex(size*8), 
new Icosahedron(size).toCSG().movex(size*4),

]