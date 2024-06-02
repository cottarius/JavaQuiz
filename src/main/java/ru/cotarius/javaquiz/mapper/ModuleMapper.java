package ru.cotarius.javaquiz.mapper;

import org.springframework.stereotype.Component;
import ru.cotarius.javaquiz.dto.ModuleDto;
import ru.cotarius.javaquiz.entity.Module;

import java.util.List;

@Component
public class ModuleMapper {

    public Module toModule(ModuleDto moduleDto) {
        Module module = new Module();
        module.setTitle(moduleDto.getTitle());
        return module;
    }

    public ModuleDto toModuleDto(Module module) {
        ModuleDto moduleDto = new ModuleDto();
        moduleDto.setId(module.getId());
        moduleDto.setTitle(module.getTitle());
        return moduleDto;
    }

    public List<ModuleDto> toModuleDtoList(List<Module> moduleList) {
        return moduleList.stream().map(this::toModuleDto).toList();
    }

    public List<Module> toModuleList(List<ModuleDto> moduleDtoList) {
        return moduleDtoList.stream().map(this::toModule).toList();
    }
}
