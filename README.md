# ChestTerminal-drake

[![Rama](https://img.shields.io/badge/branch-1.21--latin-2ea44f)](https://github.com/DrakesCraft-Labs/ChestTerminal-drake/tree/1.21-latin)
[![Licencia](https://img.shields.io/github/license/DrakesCraft-Labs/ChestTerminal-drake)](https://github.com/DrakesCraft-Labs/ChestTerminal-drake/blob/1.21-latin/LICENSE)
[![Ultimo commit](https://img.shields.io/github/last-commit/DrakesCraft-Labs/ChestTerminal-drake/1.21-latin)](https://github.com/DrakesCraft-Labs/ChestTerminal-drake/commits/1.21-latin)

## Descripción técnica
Addon de acceso remoto a inventarios/redes de cofres para flujos de logística en Slimefun.

## Qué añade a Slimefun
- Simplifica gestión de almacenamiento masivo.
- Reduce fricción en automatización de insumos.
- Mejora ergonomía de bases tecnológicas.

## Características principales
- Terminal de acceso para almacenamiento distribuido.
- Interacciones de inventario enfocadas en calidad de vida.
- Port actualizado a APIs de Dough/Slimefun usadas por Drake.

## Matriz de compatibilidad
| Componente | Estado |
|---|---|
| Minecraft | 1.21.x |
| Paper/Purpur | 1.21.x |
| Slimefun Core Drake | 11.x (línea `1.21-latin`) |
| Java | 21 |

## Instalación
1. Descarga el `.jar` de Releases del repositorio.
2. Copia el archivo en la carpeta `plugins/` del servidor.
3. Asegura dependencias (`Slimefun`, `ProtocolLib` u otras según addon).
4. Reinicia el servidor y revisa `logs/latest.log` para validar carga.

## Build local
```bash
mvn -DskipTests clean package
```

Artefacto esperado:
- `target/ChestTerminal-drake-*.jar`

## Flujo de release
1. Crear branch de cambios (`feature/*` o `fix/*`).
2. Abrir PR hacia `1.21-latin` con plan de pruebas.
3. Al mergear, crear tag/release y publicar jar compilado.

Incluir notas de compatibilidad de UI/Inventario con versión de Paper objetivo.

## Relación con el monorepo
Este repositorio se mantiene en paralelo con `drakes-slimefun-labs` para desarrollo aislado por addon y despliegues independientes.